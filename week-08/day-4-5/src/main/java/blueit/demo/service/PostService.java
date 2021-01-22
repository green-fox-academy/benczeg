package blueit.demo.service;

import blueit.demo.model.Post;
import blueit.demo.repo.PostRepository;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

@Service
public class PostService {
  PostRepository postRepository;

  @Autowired
  public PostService(PostRepository postRepository) {
    this.postRepository = postRepository;
  }

  public List<Post> findAll() {
    return (List<Post>) postRepository.findAll();
  }

  public String newPostAdder(String title, String content, long currentID) {
    if (postRepository.existsByTitle(title)) {
      return "Already existing post title.";
    } else {
      postRepository.save(new Post(title, content/*, currentID*/));
      return "New post saved";
    }
  }

  public Post findPostById(Long id) {
    return postRepository.findById(id)
        .orElse(new Post("Couldn't find post", "Couldn't find this post, sorry."));
  }

  public String upVote(Long id) {
    Optional<Post> post = postRepository.findById(id);
    if (post.isPresent()) {
      Post post1 = post.get();
      post1.setUpvote(post.get().getUpvote() + 1);
      postRepository.save(post1);
      return "Up voted";
    } else {
      return "Something went wrong.";
    }
  }

  public String downVote(Long id) {
    Optional<Post> post = postRepository.findById(id);
    if (post.isPresent()) {
      Post post1 = post.get();
      post1.setUpvote(post.get().getUpvote() - 1);
      postRepository.save(post1);
      return "Down voted";
    } else {
      return "Something went wrong.";
    }
  }

  public List<Post> getStartingPage() {
    return postRepository.getPostListByPage(1);
  }

  public List<Post> getGivenPage(int page) {
    return postRepository.getPostListByPage(page * 5 - 5);
  }

  public List<Integer> getPages() {
    int pages = (int) postRepository.count() / 5;
    List<Integer> pageList = new ArrayList<>();
    for (int i = 1; i <= pages; i++) {
      pageList.add(i);
    }
    return pageList;
  }
}
